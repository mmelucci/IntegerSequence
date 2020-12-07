import java.util.NoSuchElementException;
// import java.util.IllegalArgumentException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    if (end < start) {
      throw new IllegalArgumentException("End cannot be less than  start");
    }
    this.start = start;
    this.end = end;
    this.current = start;
  }
  public void reset(){
    this.current = this.start;
  }
  public int length(){
    return (this.end-this.start+1);
  }
  public boolean hasNext(){
    if (this.current == this.end+1) {
      return false;
    }
    return true;
  }

  //@throws NoSuchElementException
  public int next(){
    int temporary = this.current;
    if (this.current == this.end+1) {
      throw new NoSuchElementException("The current element of the sequence, " + this.current + " is the last of the range");
    }
    this.current ++;
    return temporary;
  }
}
