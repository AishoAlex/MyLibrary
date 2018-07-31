import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SiteConnection {
    private String url;
    private StringBuffer data;
    public  SiteConnection(String url){
        this.url = url;
    }
    public boolean getSite(){
        try {
            URL url = new URL(this.url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){
                System.out.println(conn.getHeaderFields());

                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null){
                    response.append(inputLine+'\n');
                }
                in.close();


//                InputStream in = conn.getInputStream();
//                StringBuffer response = new StringBuffer();
//              for(int i; (i = in.read()) != -1; ){
//                    response.append((char)i);
//              }
//                in.close();
                this.data = new StringBuffer(response);
//                System.out.println(response.toString());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public StringBuffer getData(){
        return this.data;
    }


    public String getUrl(){
        return this.url;
    }


}
