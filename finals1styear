//Libraries used
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <iomanip>


//Global variables
    int burgerCount;
    int friesCount;
    int saladCount;
    int hotdogCount;
    int drinksCount;
    int chickenCount;
    int riceCount;
    int icecreamCount;
    float total;
    const float burgerCost = 25.00;
    const float friesCost = 20.00;
    const float saladCost = 27.00;
    const float hotdogCost = 17.00;
    const float drinksCost = 12.00;
    const float chickenCost = 30.00;
    const float riceCost = 10.00;
    const float icecreamCost = 15.00;


using namespace std;

//Function: prints menu
void menu(void) {
   system("cls");
    cout <<setw(48)<<setfill ('-') << "MENU";
    cout <<setfill ('-') << setw(48) << "\n";
    cout << setfill(' ') << setw(29)<< " " << "Welcome! Here is the menu for the restaurant." << setw(29) << endl;
    cout << setw(29)<< " " << "To select a dish choose a letter then enter the quantity" << setw(29) << endl;
    cout << setfill('-') << setw(96) << "\n";
    cout << setfill(' ') << setw(29) << " " << "Burger    (b)   -     Php25.00\n";
    cout << setfill(' ') << setw(29) << " " << "Fries     (f)   -     Php20.00\n";
    cout << setfill(' ') << setw(29) << " " << "Salad     (s)   -     Php27.00\n";
    cout << setfill(' ') << setw(29) << " " << "Hotdog    (h)   -     Php17.00\n";
    cout << setfill(' ') << setw(29) << " " << "Drinks    (d)   -     Php12.00\n";
    cout << setfill(' ') << setw(29) << " " << "Chicken   (c)   -     Php30.00\n";
    cout << setfill(' ') << setw(29) << " " << "Rice      (r)   -     Php10.00\n";
    cout << setfill(' ') << setw(29) << " " << "Ice Cream (i)   -     Php15.00\n";
    cout << setfill(' ') << setw(29) << " " << "Confirm your order? (e)\n";
}

//Function: Counts menu items
void itemCount(char item, int quantity) {

    switch (item) {
    case 'b':
       burgerCount = burgerCount + quantity;
        if (burgerCount < 0) {
            burgerCount = 0;
        }break;
    case 'f':

       friesCount = friesCount + quantity;
        if (friesCount < 0) {
            friesCount = 0;
        }break;
    case 's':

       saladCount =saladCount + quantity;
        if (saladCount < 0) {
            saladCount = 0;
        }break;
    case 'h':

       hotdogCount = hotdogCount + quantity;
        if (hotdogCount < 0) {
            hotdogCount = 0;
        }break;
    case 'd':

        drinksCount = drinksCount + quantity;
        if (drinksCount < 0) {
            drinksCount = 0;
        }break;
    case 'c':

       chickenCount = chickenCount + quantity;
        if (chickenCount < 0) {
            chickenCount = 0;
        }break;
    case 'r':

        riceCount = riceCount + quantity;
        if (riceCount < 0) {
            riceCount = 0;
        }break;
    case 'i':

        icecreamCount = icecreamCount + quantity;
        if (icecreamCount < 0) {
            icecreamCount = 0;
        }break;
    }
}

//Function: prints iteam totals and gives total
void itemTotals() {
    cout << setfill('-') << setw(48) << "Totals";
    cout << setfill('-') << setw(48) << "\n";
    if (burgerCount > 0) {
        cout << setfill(' ') << setw(37) << "Burgers:" << burgerCount << endl;
    }
    if (friesCount > 0) {
        cout << setfill(' ') << setw(37) << "Fries:" << friesCount << endl;
    }
    if (saladCount > 0) {
        cout << setfill(' ') << setw(37) << "Salad:" << saladCount << endl;
    }
    if (hotdogCount > 0) {
        cout << setfill(' ') << setw(37) << "Hotdog:" << hotdogCount << endl;
    }
    if (drinksCount > 0) {
        cout << setfill(' ') << setw(37) << "Drinks:" << drinksCount << endl;
    }
    if (chickenCount > 0) {
        cout << setfill(' ') << setw(37) << "Chicken:" << chickenCount << endl;
    }
    if (riceCount > 0) {
        cout << setfill(' ') << setw(34) << "Rice:" << riceCount << endl;
    }
    if (icecreamCount > 0) {
        cout << setfill(' ') << setw(37) << "Ice Cream:" << icecreamCount << endl;
    }

   total = (burgerCount * burgerCost) + (friesCount * friesCost) + (saladCount * saladCost) + (hotdogCount * hotdogCost) + (drinksCount *drinksCost) + (chickenCount * chickenCost) + (riceCount * riceCost) + (icecreamCount * icecreamCost);

    cout << setfill(' ') << setw(40) << "Total: Php " << fixed << setprecision(2) << total << endl;
    cout << setfill('-') << setw(96) << " " << endl;
}


char ItemChecker(char x, int y = 0) {
    if (x == 'b' || x == 'f' || x == 's' || x == 'h' || x == 'd' || x == 'c' || x == 'r' || x == 'i') {
        cout << setfill(' ') << setw(38) << "Quantity:";
        cin >> y;
        itemCount(x, y);
    }
    else if (x == 'e') {
        return x;
    }
    else {
        cout << setfill(' ') << setw(40) << "Enter a valid item :";
        cin >> x;
        ItemChecker(x, y);

    }


}

void Payment() {
    char pay;
    cout << setfill(' ') << setw(50) << "[C]  Cash on Delivery" << endl;
    cout << setfill(' ') << setw(48) << "[O]  Online Billing" << endl;
    cout << setfill(' ') << setw(54) << "Select method of payment:";
    cin >> pay;

    if (pay == 'C' || pay == 'c') {
        cout << setfill('-') << setw(96) << "\n";
        cout << setfill(' ') << setw(62) << "You have chosen Cash on Delivery." << endl;
        cout << setfill(' ') << setw(58) << "Thank you for your patronage!" << endl;
    }
    else if (pay == 'O' || pay == 'o') {
        cout << setfill('-') << setw(96) << "\n";
        cout << setfill(' ') << setw(60) << "You have chosen Online Billing." << endl;
        cout << setfill(' ') << setw(58) << "Thank you for your patronage!" << endl;
    }
    else {
        cout << setfill(' ') << setw(50) << "Enter a valid option!" << endl;
            Payment();
    }
}


int main()
{
    char item = 'b';
    int y = 0;
    do{
        //prints menu and item count and total
        menu();
        itemTotals();

        //requests item and quantity
        cout << setfill(' ') << setw(44) << "Enter the Item:";
        cin >> item;
        ItemChecker(item, y);

    } while (item != 'e');

    system("cls");
    cout << setfill('-') << setw(96) << "\n";
    cout << setfill(' ') << setw(56) << "Here is your total order: \n";
        itemTotals();
        Payment();
    

    return 0;
}
