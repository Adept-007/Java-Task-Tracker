import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class TaskService {
    public void markComplete(int id){
        String query="UPDATE tasks SET completed = true WHERE id = ?";
        try (
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
         ){
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Task marked Completed!");
         } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTask(int id){
        String query="DELETE FROM tasks WHERE id = ?";
        try (
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
        )
        {
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Task Deleted!");
        }
            
         catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewTasks(){;

        String query="SELECT * FROM tasks";
        try (
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
         ){
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(
                    rs.getInt("id")+"|"+
                    rs.getString("title") + "|" +
                    rs.getString("priority") + "|" +
                    rs.getDate("deadline") + "|" +
                    rs.getBoolean("completed")
                );
            }
         } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    public void addTask(Task task){
        String query="INSERT INTO tasks(title,completed,priority,deadline) VALUES(?,?,?,?)";
        try (
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(query);
        )
        {
            ps.setString(1,task.getTitle());
            ps.setBoolean(2,task.isCompleted());
            ps.setString(3,task.getpriority());
            ps.setDate(4,Date.valueOf(task.getDeadline()));
            ps.executeUpdate();
            System.out.println("Task Added!");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
