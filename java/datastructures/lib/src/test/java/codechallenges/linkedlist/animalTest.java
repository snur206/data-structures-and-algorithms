package codechallenges.linkedlist;

import codechallenges.linkedlist.animal.Animal;
import codechallenges.linkedlist.animal.AnimalShelter;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class animalTest {
  @Test
  void enqueueAddsAnimalToShelter() {
    AnimalShelter sut = new AnimalShelter();
    Animal dog = new Animal("dog", "cat");
    sut.enqueue(dog);
  }

  @Test
  void dequeueRemovesDogFromShelter() {
    AnimalShelter sut = new AnimalShelter();
    Animal dog = new Animal("dog", "Brodie");
    Animal cat = new Animal("cat", "Simba");
    sut.enqueue(dog);
    sut.enqueue(cat);
    assertEquals("dog",sut.dequeue("dog"));
  }

  @Test
  void dequeueRemovesCatFromShelter() {
    AnimalShelter sut = new AnimalShelter();
    Animal dog = new Animal("dog", "Brodie");
    Animal cat = new Animal("cat", "Simba");
    sut.enqueue(dog);
    sut.enqueue(cat);
    assertEquals("cat",sut.dequeue("cat"));
  }
}
