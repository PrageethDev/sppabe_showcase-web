(function(){

    var app = angular.module('gemStore', []);

    app.controller('StoreController', function(){
        this.products = gems;
    });

    var gems = [
        {
            name:'Royal cupcake',
            price:2.5,
            description:'Royal cupcakes are the greatest you will ever taste',
            canPurchase:true,
            soldOut:false
        },
        {
            name:'Regular cupcake',
            price:1.75,
            description:'Just feel the taste you will never resist',
            canPurchase:true,
            soldOut:false
        },
        {
            name:'Royal date cakes',
            price:3,
            description:'Royal date cakes are the greatest you will ever taste',
            canPurchase:true,
            soldOut:false
        },
        {
            name:'Regular date cakes',
            price:2,
            description:'Just feel the taste you will never resist',
            canPurchase:true,
            soldOut:false
        }
    ];

})();

