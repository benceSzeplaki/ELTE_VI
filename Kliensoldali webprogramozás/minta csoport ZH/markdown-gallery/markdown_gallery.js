class ImageTextarea extends HTMLElement {

    constructor() {
        super();
        this.textarea = document.querySelector("[data-markdown]");
        this.showImages();
    }

    showImages() {
        this.ul = document.createElement('ul');
        this.regexp = /!\[\]\((.*?)\)/g;
        this.textarea.insertAdjacentElement('afterend', this.ul);
        this.imageList = this.textarea.value.matchAll(this.regexp);
        this.ul.innerHTML = "";
        for (const image of this.imageList) {
            let li = document.createElement('li');
            let img = document.createElement('img');
    
            img.src = image[1];
    
            li.appendChild(img);
            this.ul.appendChild(li);
        }
    }

    connectedCallback() {
        this.textarea.addEventListener("input", () => {showImages();});
    }

    disconnectedCallback() {
        this.textarea.removeEventListener("input", () => {showImages();});
    }

}

window.customElements.define(
    'image-textarea',
    ImageTextarea
);