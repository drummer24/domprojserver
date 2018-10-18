/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domproj;
import java.util.ArrayList;
        
/**
 *
 * @author palka
 */
class task{
    private String taskname;
    private String progress; 
    task(String taskname){
        this.taskname=taskname;
        this.progress="in progres";
    }
    public String gettask(){
        return this.taskname;
    }
    public String getprogress(){
        return this.progress;
    }
}
class node{
    private task data;
    private ArrayList<node> childs = new ArrayList<node>();
    private node parent=null;
    node(task data){
        this.data=data;
    }
    node(task data,node par){
        this.data=data;
        this.parent=par;
    }
    public void addchild(node child){
        this.childs.add(child);
    }
    
    public task getdata(){
        return this.data;
    }
    public ArrayList getchildreins(){
        return this.childs;
    }
}  

