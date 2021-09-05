package StructuralPattern.Proxy;

public class ServiceProxy {
    private Service service;
    public ServiceProxy(Service service){
        this.service=service;
    }

    public void work(String username,String password){
        if(isAuthenticated(username,password)){
            service.work();
        }else{
            System.out.println("You don't have access");
        }
    }

    public boolean isAuthenticated(String username,String password){
        if(username.equals("word")&&password.equals("123456")){
            return true;
        }
        return false;
    }
}
