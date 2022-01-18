/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class DaoInquilino {
    
    public void cadastrarInquilino(Inquilino inquilino) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
     
        try {
            String sql = "INSERT INTO inquilino ("
                    + "nome,"
                    + "datanascimento,"
                    + "sexo," 
                    + "telefone," 
                    + "email,"                     
                    + "codunidade) VALUES (?,?,?,?,?,?)";
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1, inquilino.getNome());
            pstm.setDate(2, inquilino.getDataNascimento());
            pstm.setString(3, String.valueOf(inquilino.getSexo()));
            pstm.setString(4, inquilino.getTelefone()); 
            pstm.setString(5, inquilino.getEmail());
            pstm.setInt(6, inquilino.getCodUnidade());                           
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Inquilino Criada Com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);                        
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao inserir "
                    + "Inquilino no banco de dados"+erro,
                    "Erro",JOptionPane.ERROR_MESSAGE);            
        }     
        finally{
            Conexao.closeConnection(connection, pstm);
        }
    }

    public void editarInqulino(Inquilino inquilino) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        
        System.out.println(inquilino);
        
        try {
            String sql = "UPDATE inquilino SET "
                    + "nome=?,"
                    + "datanascimento=?,"
                    + "sexo=?," 
                    + "telefone=?," 
                    + "email=?,"
                    + "codunidade=? "
                    + "WHERE codinquilino=?";
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1, inquilino.getNome());
            pstm.setDate(2, inquilino.getDataNascimento());
            pstm.setString(3, String.valueOf(inquilino.getSexo()));
            pstm.setString(4, inquilino.getTelefone()); 
            pstm.setString(5, inquilino.getEmail());
            pstm.setInt(6, inquilino.getCodUnidade());              
            pstm.setInt(7, inquilino.getCodInquilino());
                        
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados do Inquilino"+erro
                    + " no banco","Erro",
                    JOptionPane.ERROR_MESSAGE);   
        }  
        finally{
            Conexao.closeConnection(connection, pstm);
        }
     }

    public void removerInquilino(int codInquilino) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        
        try {
            String sql = "DELETE FROM inquilino WHERE codinquilino=?";
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, codInquilino);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException erro) {            
            JOptionPane.showMessageDialog(null,"Erro ao Deleta Inquilino no banco",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }
        finally{
            Conexao.closeConnection(connection, pstm);
        }
    }

    public List<Inquilino> listarInquilino() {
        
        List<Inquilino> inquilinos = new ArrayList<>();
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        ResultSet resultSet = null;
        
        try {
            String sql = "SELECT *FROM inquilino;";
            pstm = connection.prepareStatement(sql);    
            resultSet = pstm.executeQuery();
            
            while (resultSet.next()) { 
                
                Inquilino objInquilino = new Inquilino();
                objInquilino.setCodInquilino(resultSet.getInt("codinquilino"));
                objInquilino.setNome(resultSet.getString("nome"));
                objInquilino.setDataNascimento(resultSet.getDate("datanascimento"));                                
                objInquilino.setSexo(resultSet.getString("sexo").charAt(0));
                objInquilino.setTelefone(resultSet.getString("telefone"));   
                objInquilino.setEmail(resultSet.getString("email")); 
                objInquilino.setCodUnidade(resultSet.getInt("codunidade"));                 
                inquilinos.add(objInquilino);         
            }
        } catch (SQLException erro) {            
            JOptionPane.showMessageDialog(null,"Erro de Leitura do Banco",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }  
        finally{
            Conexao.closeConnection(connection, pstm, resultSet);
        }
        return inquilinos;
    }    
    
}
