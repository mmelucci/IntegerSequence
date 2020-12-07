import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    this.currentIndex = 0;
    for (int i = 0; i < other.length; i ++) {
      this.data[i] = other[i];
    }
  }
  public void reset () {
    this.currentIndex = 0;
  }
  public int length(){
    return 0;
  }
  public boolean hasNext(){
    return true;
  }
  public int next(){
    return 0;
  }
}
