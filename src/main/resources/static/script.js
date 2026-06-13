var id = "";
const output = document.querySelector('.output');

document.querySelectorAll('.edi-type').forEach((button) => {
    button.addEventListener('click', async ()=> {
        id = button.getAttribute('id');
        const resp = await fetch(`/api/claim/${id}`);
        console.log(await resp.text());
        enableViews();
    });
});

function enableViews() {
    document.querySelectorAll('.output-type').forEach(button => {
        button.disabled = false;
    } )
}

document.querySelectorAll('.output-type').forEach(button => {
    button.addEventListener('click', async () => {
        const mode = button.getAttribute("id");
        const resp = await fetch(`api/render/${id}/${mode}`, {
            method: "POST"
        });
        const text = await resp.text();
        render(text);
    })
});

function render(text) {
    output.textContent = text;
}