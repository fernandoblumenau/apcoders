/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Despesa;
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
public class DaoDespesa {
    
    public void cadastrarDespesa(Despesa despesa) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
     
        try {
            String sql = "INSERT INTO despesa ("
                    + "codunidade,"
                    + "descricao," 
                    + "tipo," 
                    + "valor,"  
                    + "vencimento,"                      
                    + "statuspgto) VALUES (?,?,?,?,?,?)";
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, despesa.getCodUnidade());                        
            pstm.setString(2, despesa.getDescricao());
            pstm.setString(3, despesa.getTipo());
            pstm.setDouble(4, despesa.getValor()); 
            pstm.setDate(5, despesa.getVencimento());
            pstm.setBoolean(6, despesa.getStatusPgto());                           
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Despesas Criada Com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);                        
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao inserir "
                    + "Despesa no banco de dados"+erro,
                    "Erro",JOptionPane.ERROR_MESSAGE);            
        }     
        finally{
            Conexao.closeConnection(connection, pstm);
        }
    }

    public void editarDespesa(Despesa despesa) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;        
        
        try {
            String sql = "UPDATE despesa SET "
                    + "codunidade=?,"
                    + "descricao=?,"
                    + "tipo=?," 
                    + "valor=?," 
                    + "vencimento=?,"
                    + "statuspgto=? "
                    + "WHERE coddespesa=?";
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, despesa.getCodUnidade());
            pstm.setString(2, despesa.getDescricao());  
            pstm.setString(3, despesa.getTipo()); 
            pstm.setDouble(4, despesa.getValor());                      
            pstm.setDate(5, despesa.getVencimento());
            pstm.setBoolean(6, despesa.getStatusPgto());                           
            pstm.setInt(7, despesa.getCodDespesa());
                        
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados de despesa"+erro
                    + " no banco","Erro",
                    JOptionPane.ERROR_MESSAGE);   
        }  
        finally{
            Conexao.closeConnection(connection, pstm);
        }
     }

    public void removerDespesa(int codDespesa) {
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        
        try {
            String sql = "DELETE FROM despesa WHERE coddespesa=?";
            pstm = connection.prepareStatement(sql);
            
            pstm.setInt(1, codDespesa);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso",
                    "Informação Sistema",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException erro) {            
            JOptionPane.showMessageDialog(null,"Erro ao Deletar Despesa no banco",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }
        finally{
            Conexao.closeConnection(connection, pstm);
        }
    }

    public List<Despesa> listarDespesa() {
        
        List<Despesa> despesas = new ArrayList<>();
        Connection  connection = Conexao.conectar();
        PreparedStatement  pstm =null;
        ResultSet resultSet = null;
        
        try {
            String sql = "SELECT *FROM despesa;";
            pstm = connection.prepareStatement(sql);    
            resultSet = pstm.executeQuery();
            
            while (resultSet.next()) { 
                
                Despesa objDespesa = new Despesa();
                objDespesa.setCodDespesa(resultSet.getInt("coddespesa"));
                objDespesa.setCodUnidade(resultSet.getInt("codunidade"));
                objDespesa.setDescricao(resultSet.getString("descricao"));                                
                objDespesa.setTipo(resultSet.getString("tipo"));
                objDespesa.setValor(resultSet.getDouble("valor"));   
                objDespesa.setVencimento(resultSet.getDate("vencimento")); 
                objDespesa.setStatusPgto(resultSet.getBoolean("statuspgto"));                 
                despesas.add(objDespesa);         
            }
        } catch (SQLException erro) {            
            JOptionPane.showMessageDialog(null,"Erro de Leitura do Banco",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }  
        finally{
            Conexao.closeConnection(connection, pstm, resultSet);
        }
        return despesas;
    }       
    
}
