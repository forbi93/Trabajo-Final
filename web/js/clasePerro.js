class Perro {
    //Constructor
    constructor(nombre, tamaño, edad, sexo, pelaje, descripcion) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.edad = edad;
        this.sexo = sexo;
        this.pelaje = pelaje;
        this.descripcion = descripcion;
    }

}

//Perros
const perro1 = new Perro("Romeo", "pequeño", "cachorro", "macho", "regular", " Y soy muy cariñoso con los niños porque los voy a proteger de cualquier peligro, asimismo tengo un juguete favorito que es una pelota roja y me encanta jugar con ella,ademas de eso soy muy obediente y adorable con bastante pelo")
const perro2 = new Perro("Timoteo", "mediano", "joven", "macho", "regular", "fui un perro que encotraron mal de salud,pero me fui recuperando,y asi sali de peligro y ahora soy perro que le encanta el aguay me encanta jugar con gatos,ademas soy perro tranquilo si me adoptan y los voy hacer la familia mas unida que nunca¡adoptanos!")
const perro3 = new Perro("Titan", "pequeños", "joven", "macho", "regular", " me pusieron asi porque fui un perro muy loco cuando hera cachorro,cuando fui creciendo me vuelto bueno en concursos de perros, porque soy educado y ademas ya no ago desorden me gustar estar siempre acompañado de personas ya que de esta manera me adecuo a cualquier ambiente ¡adoptanos! ")
const perro4 = new Perro("Duque", "grande", "joven", "macho", "demasiado", " un perro guardian para los niños y ansianos ya que les avertire de cualquier peligro en la casa y de esta manera ayudare a cuidar a todos los que vivan en el hogar,me encanta la picina y nadar,y soy muy ovediente les dare amor y felicida a toda la casa")
const perro5 = new Perro("Tovi", "cachorro", "joven", "macho", "demasiado", " por desgracia ya soy un perro muy viejo,y tengo un amiguito llamado tovi en el cual se a encariñado conmigo,asi que hasta que la muerte se aserca quisiera que me cumplan un deseo, dicho deceo seria estar en una familia con mi fiel amiguito tobi,y no causare ningun problema,me encanta jugar en la nieve¡adoptanos!")
const perro6 = new Perro("Rabito", "grande", "joven", "macho", "regular", "tenia un dueño y un cierto dia irrumpieron la casa y mi dueño salio herido y su madre de rabito salto para proteger a nuestro dueño y lo mataron a los dos y nostros nos escapamos,ellos nos encontaron y recuperamos el sentimiento de jugar y de ser lealeales como siempre,quisiera tener una familia para dar el cariño a igual que fui con mi antiguo dueño ¡adoptanos!")
const perro7 = new Perro("Manchas", "pequeño", "joven", "macho", "regular", " soy un perro muy jugueton y me gusta muchos los niños,soy muy leal,cuando me dan higado frito mis vaterias se preden y obtengo bastante energia, de esa manera comienzo a jugar todo el dia, ademas les avisare de cualquier peligro que corran,me encanta el agua,y el dulce ¡adopteme!")
const perro8 = new Perro("Scott", "pequeño", "cachorro", "macho", "regulat", "a este cachorro lo encontramos abandonado en un vasurero asustando y temblando asi que nosotros le dimos los tratamientos y los mediacamentos nesesarios para que que viva ahora es un cachorro jugueton y ovediente que necesita una familia para que puedan jugar con el y no se van arempentir")
const perro9 = new Perro("Mochita", "pequeño", "cachorro", "hembra", "regular", "soy algo timida pero cuando me dan cariño me pongo muy juguetona, me gusta jugar con niños. Estoy bien educada")
const perro10 = new Perro("Kike", "grande", "joven", "macho", "regular", "es un perro rescatado del abandono es un buen perro, atiende a las ordenes principales, es muy jugueton y cariñoso. Le gusta jugar en la piscina")
const perro11 = new Perro("Mars", "pequeño", "cachorros", "macho", "poco", "Somos los cachorros del abergue 301 hemos venido a llenarlos de amor y que alguno de estudes nos ayude a adoptarnos ya que nuestro pequeño albergue se esta llenando por la ayuda que nuestros rescatadores dan. Miranos somos adorables ¡adoptanos! ")
const perro12 = new Perro("Luna", "pequeño", "joven", "macho", "regular", "Somos hermanas y queremos que nos puedan llevar juntas somos muy unidas, nos portamos bien y sabemos hacer caso a ordenes, prometemos dar mucho amor a nuestros nuevos papis")
const perro13 = new Perro("Zeus", "grande", "joven", "macho", "demasiado", "Zeus es un joven canino que busca un hogar acogedor ha sido entrenado para ayudar a personas especiales, es un compañero para niños y adultos mayores.")
const perro14 = new Perro("Fermi", "grande", "joven", "macho", "demasiado", "Fermi es un cachorro joven fue rescatado de una casa abandonada, gracias al cariño del equipo ahora fermi es un perro saludable que busca el cariño y la atencion de sus nuevos padres")
const perro15 = new Perro("Betto", "grande", "anciano", "macho", "regular", "Betto es un perro anciano que perdio a sus padres ya mayores de edad, ahora el busca un acompañante que lo cuide y vea por el. Es un cariñoso con los niños y adultos mayores. Es un buen acompañante y respeta ordenes y comandos de voz")
const perro16 = new Perro("MiniMike", "pequeño", "cachorro", "macho", "poco", "MiniMike es el hijo de Mike un perro entrenado para las fuerzas caninas, MiniMike ha sido entrenado al igual que su padre busca una familia que lo cuide y le de amor es un cachorro muy activo y tierno")

//variables
const classBtn = document.querySelectorAll('button.btnActive');
const classDiv = document.querySelectorAll('div.degraBox');
const formBox = document.getElementsByClassName('formBox');
const swiper = document.getElementsByClassName('swiper-slide');
const title = document.getElementById('title');
const imgPerro = document.getElementById('img_perro')
let perroSelect;
let array1 = ["Hola soy", "Me llamo", "Encantado soy", "Buenas, me llamo", "Llamame", "Dime"];
let array2 = ["¿Quieres adoptarme?", "¿Puedo ser parte de tu familia?", "Y quiero ser tu compañero", "Y me gustaria irme contigo"]
let a, b;



//BtnAdoptar
for (let i = 0; i < classBtn.length; i++) {
    classBtn[i].addEventListener("click", () => {
        formBox[0].classList.remove("divActive");
        classBtn[i].id = `perro${i+1}`
        perroSelect = `perro${i+1}`;
        document.getElementsByClassName('perroTxt')[0].textContent = `${eval(perroSelect).descripcion}`;
        imgPerro.src = `imagenes/perrosAdop/img_perro${i+1}.jpg`;
        console.log(perroSelect);

    })
}

console.log(perroSelect);