public class main {
    public static void main(String args[]){
        SiteConnection connect = new SiteConnection("https://ficbook.net");
        connect.getSite();
        System.out.println(connect.getData());
    }
}
