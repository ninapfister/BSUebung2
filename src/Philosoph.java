public class Philosoph extends Thread
{
    Gabel linkeGabel;
    Gabel rechteGabel;

    public void run ()
    {
       while(true)
       {
           this.linkeGabel.nehmen();
           this.rechteGabel.nehmen();

           System.out.println("Hallo Hunger");

           this.linkeGabel.hinlegen();
           this.rechteGabel.hinlegen();
       }
    }

    public static void main (String[]args)
    {

        Gabel Gabel1 = new Gabel ();
        Gabel Gabel2 = new Gabel ();
        Gabel Gabel3 = new Gabel ();
        Gabel Gabel4 = new Gabel ();
        Gabel Gabel5 = new Gabel ();

        Philosoph Philosoph1 = new Philosoph(Gabel1, Gabel2);
        Philosoph Philosoph2 = new Philosoph(Gabel2, Gabel3);
        Philosoph Philosoph3 = new Philosoph(Gabel3, Gabel4);
        Philosoph Philosoph4 = new Philosoph(Gabel4, Gabel5);
        Philosoph Philosoph5 = new Philosoph(Gabel5, Gabel1);

        Philosoph1.start();
        Philosoph2.start();
        Philosoph3.start();
        Philosoph4.start();
        Philosoph5.start();

    }

    public Philosoph (Gabel linkeGabel, Gabel rechteGabel)
    {
        this.linkeGabel =  linkeGabel;
        this.rechteGabel = rechteGabel;
    }
}
