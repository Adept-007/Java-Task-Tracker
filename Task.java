import java.time.LocalDate;
public class Task {
            private String title;
            private boolean completed;
            private String priority;
            private LocalDate deadline;

            public Task(
                String title,
                String priority,
                LocalDate deadline
            ){
                this.title=title;
                this.priority=priority;
                this.deadline=deadline;
                this.completed=false;
            }

            public String getTitle(){
                return title;
            }
            public String getpriority(){
                return priority;
            }
            public boolean isCompleted(){
                return completed;
            }
            public LocalDate getDeadline(){
                return deadline;
            }
            
}
