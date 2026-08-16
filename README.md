# LoveCube-Marketplace
An online marketplace for Love Cube 

## Project Description
Love Cube is a charity-based school marketplace.
- Sellers list fixed-price items.
- Buyers add items to cart, checkout, and create orders.
- Inventory stored in a 2D category grid.
- Orders track status: placed → shipped.

## Classes
- User: parent class (userId, password)
- Buyer: extends User, Cart, order history
- Seller: extends User, listed items, update order status
- Item: name, id, quantity, price, type
- Cart: items + quantities
- Inventory: 2D array storage, search by name
- Order: orderId, total, status
- Marketplace: manages users, inventory, orders

## CSA Concepts Used
- 2D Array (Inventory category grid)
- ArrayList (Cart, orders, users, listed items)
- Encapsulation (private fields, getters)
- Inheritance (Buyer/Seller extend User)
- Nested loops (search 2D array)

## How to Run
1. All files in package `market`
2. Run `LoveCubeMarketplace.java`
3. Sample users:
   - Seller: 101 / sellpass
   - Buyer: 201 / buypass

## Test Cases
1. Empty cart checkout
2. Add quantity greater than stock
3. Search non-existent item
4. Checkout with insufficient stock
5. Login with wrong password
