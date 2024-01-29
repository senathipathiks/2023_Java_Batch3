const products = [
    { name: 'Product 1', price: 20.99 },
    { name: 'Product 2', price: 15.49 },
    { name: 'Product 3', price: 30.00 },
    // Add more products as needed
];

const productContainer = document.getElementById('product-list');

function displayProducts() {
    products.forEach(product => {
        const card = document.createElement('div');
        card.classList.add('card');
        card.innerHTML = `
            <div class="card-body">
                <h5 class="card-title">${product.name}</h5>
                <p class="card-text">$${product.price.toFixed(2)}</p>
                <a href="#" class="btn btn-primary">Add to Cart</a>
            </div>
        `;
        productContainer.appendChild(card);
    });
}
 displayProducts();