package Cohesion;

//Low Cohesive
class MyReader {
    // -------------- unrelated functions
    public boolean validateLocation(String pathIP) {
         return ping(pathIP) && checkFTP(pathIP);
    }
    private boolean checkFTP(String pathIP) {
         return true;
    }

    private boolean ping(String pathIP) {
          return true;
    }

    // -------------- functions related to read resource

    // read the resource from disk
    public String readFromDisk(String fileName) {
         return "data of " + fileName;
    }

    // read the resource from web
    public String readFromWeb(String url) {
         return "data of " + url;
    }

    // read the resource from network
    public String readFromNetwork(String networkAddress) {
         return "data of " + networkAddress;
    }

}