void setup() {
    size(800, 200);
background(255,255,255);
}
  int dotX = 100;
void draw() {
  background(255,255,255);
  fill(153,0,76);
  if( mousePressed ){ dotX+=30; }

  ellipse(dotX,100,100,100);
  fill(255,0,0);
  rect(750,0,50,400);
  if(dotX>=750){
    playSound();
  }
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("bell.wav");
        sound.trigger();
        soundPlayed = true;
    }
}