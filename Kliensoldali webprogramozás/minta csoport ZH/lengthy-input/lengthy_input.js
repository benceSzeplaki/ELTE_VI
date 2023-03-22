const textInput = document.querySelector("input");


let color = textInput.getAttribute("data-color");
textInput.setAttribute("color", color)

textInput.addEventListener("input", () => {
    console.log(textInput.value.length, textInput.maxLength);
    let currentLength = textInput.value.length;
    let maxLength = textInput.maxLength;

    let szazalek = (currentLength * 100) / maxLength;

    if(color === null ) {
        textInput.style = `
        border-image-source: linear-gradient(to right, orange ${szazalek}%, hsla(0, 0%, 90%, 1) ${szazalek}% 100%);
        border-image-slice: 1 1 10 1;
        border-image-width: 1px 1px 5px 1px;
        border-image-outset: 0 0 5px 0;`;
    } else {
        textInput.style = `
        border-image-source: linear-gradient(to right, ${textInput.getAttribute("color")} ${szazalek}%, hsla(0, 0%, 90%, 1) ${szazalek}% 100%);
        border-image-slice: 1 1 10 1;
        border-image-width: 1px 1px 5px 1px;
        border-image-outset: 0 0 5px 0;`;
    }
});
