/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Unidade;
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
public class DaoUnidade {
    
    public void cadastrarUnidade(Unidade unidade) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
     
        try {
            String sql = "INSERT INTO unidade ("
                    + "proprietario,"
                    + "condominio,"
                    + "endereco) VALUES (?,?,?)";
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1, unidade.getProprietario());
            pstm.setString(2, unidade.getCondominio());
            pstm.setString(3, unidade.getEndereco());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Unidade Criada Com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);                        
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao inserir "
                    + "Unidade no banco de dados",
                    "Erro",JOptionPane.ERROR_MESSAGE);            
        }     
        finally{
            Conexao.closeConnection(connection, pstm);
        }
    }

    public void editarUnidade(Unidade unidade) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        
        try {
            String sql = "UPDATE unidade SET "
                    + "proprietario=?, "
                    + "condominio=?, "
                    + "endereco=? "
                    + "WHERE codunidade=?";
            pstm = connection.prepareStatement(sql);
            
            pstm.setString(1, unidade.getProprietario());
            pstm.setString(2, unidade.getCondominio());
            pstm.setString(3, unidade.getEndereco());
            pstm.setInt(4, unidade.getCodUnidade());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados da Unidade"
                    + " no banco","Erro",
                    JOptionPane.ERROR_MESSAGE);   
        }  
        finally{
            Conexao.closeConnection(connection, pstm);
        }
     }

    public void removerUnidade(int codUnidade) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        
        try {
            String sql = "DELETE FROM unidade WHERE codunidade=?";
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, codUnidade);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException erro) {            
            JOptionPane.showMessageDialog(null,"Erro ao Deleta conta no banco",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }
        finally{
            Conexao.closeConnection(connection, pstm);
        }
    }

    public List<Unidade> listarUnidade() {
        
        List<Unidade> unidades = new ArrayList<>();
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        ResultSet resultSet = null;
        
        try {
            String sql = "SELECT *FROM unidade;";
            pstm = connection.prepareStatement(sql);    
            resultSet = pstm.executeQuery();
            
            while (resultSet.next()) { 
                
                Unidade objUnidade = new Unidade();
                objUnidade.setCodUnidade(resultSet.getInt("codunidade"));
                objUnidade.setProprietario(resultSet.getString("proprietario"));
                objUnidade.setCondominio(resultSet.getString("condominio"));
                objUnidade.setEndereco(resultSet.getString("endereco"));                
                unidades.add(objUnidade);         
            }
        } catch (SQLException erro) {            
            JOptionPane.showMessageDialog(null,"Erro de Leitura do Banco",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }  
        finally{
            Conexao.closeConnection(connection, pstm, resultSet);
        }
        return unidades;
    }
    
}
