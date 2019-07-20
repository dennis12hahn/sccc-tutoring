final float TAX_RATE = 0.08625;
float bunnyPrice = 4.00;
float eggsPrice = 5.99;
float peepsPrice = 2.99;
PImage bunnyImg, eggsImg, peepsImg;
final int BASE = 250;

void setup() {
  size(500, 1000);
  bunnyImg = loadImage("bunny.jpeg");
  eggsImg = loadImage("eggs.jpeg");
  peepsImg = loadImage("peeps.jpeg");
}

void draw() {
  image(bunnyImg, 100, 50, BASE, BASE);
  image(eggsImg, 100, 350, BASE, BASE);
  image(peepsImg, 100, 650, BASE, BASE);
}

void mousePressed() {
  if (mouseX < 350 && mouseX > 100) {
    
    int quant = (int) random(1,8);
    
    if (mouseY > 50 && mouseY < 300) {
      displayOrder("bunny", quant, getCost(quant, bunnyPrice));
    }
    
    if (mouseY > 350 && mouseY < 600) {
      displayOrder("egg", quant, getCost(quant, eggsPrice));
    }
    
    if (mouseY > 650 && mouseY < 900) {
      displayOrder("peep", quant, getCost(quant, peepsPrice));
    }
  }
}

float getCost(int quantity, float price) {
  float subtotal = quantity * price;
  return subtotal + (subtotal * TAX_RATE);
}

void displayOrder(String item, int quantity, float total) {
  print("You purchased " + quantity + " " + item + (quantity > 1 ? "s" : "") + "\n");
  print("for a total of $" + total + "\n\n");
}
