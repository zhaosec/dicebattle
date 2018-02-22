
package sound;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class sound extends JFrame{
	
	
// declare variables for JFrame needed
    static JFrame frame = new JFrame();
    static JButton play = new JButton("play");
    static JButton stop = new JButton("stop"); 

// declare variables for music starts
    static InputStream input;
    static AudioStream music;
    static AudioPlayer musicPlay = AudioPlayer.player;
       
    public static void main(String[] args) {
        
// layout setting and event link
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout());
        frame.add(play);
        frame.add(stop);
        frame.show(true);
        play.addActionListener(new musicStart());
        stop.addActionListener(new musicStart());
        
// set music
        try
        {
            input = sound.class.getResourceAsStream("/sound/bgm/BanditBossBattle.wav");
            music = new AudioStream(input);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }        
    }
    
// creating button event
    public static class musicStart implements ActionListener{
        public final void actionPerformed(ActionEvent e) {
            if(e.getSource() == play)
                musicPlay.start(music);
            else if(e.getSource() == stop)
                musicPlay.stop(music);
            
        }
    }
}
