//a, Tüntesd el a btn-new-content azonosítójú gombot! (1 pont)
const button = document.querySelector("#btn-new-content");
button.style.display = "none";

//b, Érzékelve az oldal aljára érést, írd ki a konzolra: End of page! (2 pont)
window.addEventListener("scroll" , () => {
    if(window.scrollY + window.innerHeight >= document.documentElement.scrollHeight) {
        console.log("End of page!");
        addMoreLines();
    }
});

//c, Ekkor szúrj be tetszőleges tartalmat a body elem gyerekei közé utolsónak (appendChild)! (1 pont)
//d, A beszúrt tartalom legyen a <template> elem tartalma! (1 pont)

const template = document.querySelector("#newRow");
const body = document.querySelector("body");

function addMoreLines() {
    const newDiv = document.createElement('div');
    newDiv.innerHTML = template.innerHTML;
    body.appendChild(newDiv);
}

