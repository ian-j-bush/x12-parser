document.querySelectorAll('.edi-type').forEach((button) => {
    button.addEventListener('click', ()=> {
        enableViews();
    });
});

function enableViews() {
    document.querySelectorAll('.output-type').forEach(button => {
        button.disabled = false;
    } )
}