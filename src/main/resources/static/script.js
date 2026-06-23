var id = "";
let data = "";
const output = document.querySelector('.output');

document.querySelectorAll('.edi-type').forEach((button) => {
    button.addEventListener('click', async ()=> {
        id = button.getAttribute('id');
        const resp = await fetch(`/api/claim/${id}`);
        data = await resp.text();
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
            method: "POST",
            headers: { "Content-Type" : "text/plain" },
            body: data,
        });
        const text = await resp.text();
        render(text);
    })
});

function render(text) {
    output.textContent = text;
}