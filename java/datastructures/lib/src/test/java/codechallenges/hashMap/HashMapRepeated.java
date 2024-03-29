package codechallenges.hashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapRepeated {
  @Test void repeatedWordShort() {
    HashMap<String, Integer> sut = new HashMap<>(2);
    String test = "Once upon a time, there was a brave princess who...";
    assertEquals("a", sut.repeatedWord(test));
  }

  @Test void repeatedWordIt() {
    HashMap<String, Integer> sut = new HashMap<>(12);
    String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    assertEquals("it", sut.repeatedWord(test));
  }

  @Test void repeatedWordSummer() {
    HashMap<String, Integer> sut = new HashMap<>(2);
    String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    assertEquals("summer", sut.repeatedWord(test));
  }

  @Test void some() {

  }

}
