public class Gabel
{
    boolean available;

    public Gabel ()
    {
        available = true;
    }

    public synchronized void nehmen()
    {
        while (available != true)
        {
            try {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        available = false;
    }

    public synchronized void hinlegen()
    {
        available = true;
        notifyAll();
    }

}

