package jpa;

import java.util.List;
import java.util.ArrayList;

import javax.ejb.Remote;



@Remote
public interface Students_Records_EJBRemote {
	
	   
	   public void saveStudentRecord(RegitrationsBean inputBean);
	   
}
