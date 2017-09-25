use std::io;

fn main() {
    println!("Vamo a  jugar");
    println!("Ingresa un numero");
    let mut corazonada=String::new();
    io::stdin().read_line(&mut corazonada)
    .ok()
    .expect("algo fallo papu");
    println!("corazonada {}",corazonada );
}
