class  phone
{
    public void call()
    {
       System.out.println("make a nokia phone call");
    }

    public void sms()
    {
        System.out.println("sed nokia sms");
    }
}

interface Icamera
{
    public void click();
  
    public void record();
}

interface Imusicplayer
{
   public void play();
   public void pause();
   public void stop();
}

class smartphone extends phone implements Icamera,Imusicplayer
{
      public void videocall()
      {
        System.out.println("make a video call through smartphone");
      }

      public void click()
      {
        System.out.println("click to record");
      }

      public void record()
      {
        System.out.println("click to record");
      }

      public void play()
      {
        System.out.println("play the song");
      }
      public void pause()
      {
        System.out.println("pause the song");
      }

      public void stop()
      {
        System.out.println("stop playing the song");
      }
}


public class AAAAQ_interface 
{
    public static void main(String [] arg)
    {
        smartphone s = new smartphone();

        phone p = s;
        Icamera c = s;
        Imusicplayer mp = s;

        p.call();
        p.sms();

        System.out.println();

        c.click();
        c.record();

        System.out.println();

        mp.play();
        mp.pause();
        mp.stop();

        System.out.println();

       

       
        
    }
}
