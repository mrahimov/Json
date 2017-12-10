package nyc.c4q.jsoninclass;

/**
 * Created by muridjonrahimov on 12/10/17.
 */

public class JsonModel {
    private String status;
    private String[] message;

   public String getStatus() {
       return status;
   }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }

    public String[] getMessage() {

       return message;
   }

}
