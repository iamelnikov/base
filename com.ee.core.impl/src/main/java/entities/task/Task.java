package entities.task;

import java.util.Date;
import java.util.Set;

import com.ee.domain.community.Activity;
import com.ee.domain.community.ActivityRecord;
import com.ee.domain.community.Notification;

public abstract class Task extends Activity implements ActivityRecord
{
	private Boolean taskNotificationNeed;
	
	private Set<Task> subtasks;
	
	private Task parentTask;
	
	private Notification notification;
	
	private String taskKind;
	
	private int status;
	
	public Task() 
	{
		super();
	}


	public Boolean getTaskNotificationNeed() {
		return taskNotificationNeed;
	}


	public void setTaskNotificationNeed(Boolean taskNotificationNeed) {
		this.taskNotificationNeed = taskNotificationNeed;
	}


	public Set<Task> getSubtasks() {
		return subtasks;
	}

	public void setSubtasks(Set<Task> subtasks) {
		this.subtasks = subtasks;
	}


	public Task getParentTask() {
		return parentTask;
	}


	public void setParentTask(Task parentTask) {
		this.parentTask = parentTask;
	}


	public Notification getNotification() {
		return notification;
	}


	public void setNotification(Notification notification) {
		this.notification = notification;
	}


	public String getTaskKind() {
		return taskKind;
	}


	public void setTaskKind(String taskKind) {
		this.taskKind = taskKind;
	}


	public Date getUpdateDate() 
	{
		return this.getLastUpdatedDate();
	}

	public String getData() 
	{
		return "Update Task " + this.getTitle() + " at %s . New data " + this.status;
	}
	
	public final int getStatus() {
		return status;
	}


	public final void setStatus(int status) {
		this.status = status;
	}

}
