public class Main {
    public static void main (String[] args) {
        Node root = new Node("Animals");

        Node vertebrate = new Node("Vertebrate");
        root.addEdge(vertebrate);

        Node reptile = new Node("Reptiles");
        vertebrate.addEdge(reptile);
        Node snake = new Node("Snake");
        reptile.addEdge(snake);
        Node crocodile = new Node("Crocodile");
        reptile.addEdge(crocodile);

        Node amphibian = new Node("Amphibians");
        vertebrate.addEdge(amphibian);
        Node frog = new Node("Frog");
        amphibian.addEdge(frog);
        Node newt = new Node("Newt");
        amphibian.addEdge(newt);

        Node fish = new Node("Fish");
        vertebrate.addEdge(fish);
        Node shark = new Node("Shark");
        fish.addEdge(shark);
        Node tuna = new Node("Tuna");
        fish.addEdge(tuna);

        Node bird = new Node("Birds");
        vertebrate.addEdge(bird);
        Node wren = new Node("Wren");
        bird.addEdge(wren);
        Node swan = new Node("Swan");
        bird.addEdge(swan);

        Node mammal = new Node("Mammals");
        vertebrate.addEdge(mammal);
        Node cow = new Node("Cow");
        mammal.addEdge(cow);
        Node human = new Node("Human");
        mammal.addEdge(human);

        Node invertebrate = new Node("Invertebrates");
        root.addEdge(invertebrate);

        Node protozoa = new Node("Protozoa");
        invertebrate.addEdge(protozoa);

        Node coelenterate = new Node("Coelenerates");
        invertebrate.addEdge(coelenterate);
        Node jellyfish = new Node("Jellyfish");
        coelenterate.addEdge(jellyfish);
        Node seaAnemone = new Node("Sea Anemone");
        coelenterate.addEdge(seaAnemone);

        Node flatworm = new Node("Flatworms");
        invertebrate.addEdge(flatworm);
        Node tapeworm = new Node("Tape Worms");
        flatworm.addEdge(tapeworm);
        Node fluke = new Node("Flukes");
        flatworm.addEdge(fluke);

        Node arthropod = new Node("Arthropods");
        vertebrate.addEdge(arthropod);

        Node annelidWorm = new Node("Annelid Worms");
        invertebrate.addEdge(annelidWorm);
        Node earthworm = new Node("Earthworms");
        annelidWorm.addEdge(earthworm);
        Node leach = new Node("Leech");
        annelidWorm.addEdge(leach);

        Node mollusc = new Node("Molluscs");
        invertebrate.addEdge(mollusc);
        Node snail = new Node("Snails");
        mollusc.addEdge(snail);
        Node limpet = new Node("Limpet");
        mollusc.addEdge(limpet);

        Node echinoderm = new Node("Echinoderms");
        invertebrate.addEdge(echinoderm);
        Node starfish = new Node("Starfish");
        echinoderm.addEdge(starfish);
        Node seaUrchin = new Node("Sea Urchin");
        echinoderm.addEdge(seaUrchin);

        System.out.println("-->" + vertebrate.getValue() + "(vertebrate)");
        for(Node child : vertebrate.getEdges()) {
            System.out.println("------>" + child.getValue());
            for (Node grandchild: child.getEdges()) {
                System.out.println("---------->" + grandchild.getValue());
            }
        }
    }
}
