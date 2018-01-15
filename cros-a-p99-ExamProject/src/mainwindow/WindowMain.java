package mainwindow;

import secondarywindows.WindowGame;
import secondarywindows.WindowLogin;


// Main class: to launch game windows
public class WindowMain
{
  public static void main(String[] args)
  {
/* Creating access to 2 Windows */
// WindowGame - Creating WindowGame, which is passed to WindowLogin
    WindowGame wG = new WindowGame();

// WindowLogin - Creating WindowLogin, which receives WindowGame 
    WindowLogin login = new WindowLogin(wG);
    login.setVisible(true);
/*/Creating access to 2 Windows */
  }
}
