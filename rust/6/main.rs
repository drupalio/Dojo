fn main(){
    let a=5;
    let b=3;
    println!("Sumalos {}",sumalos(a,b));
    println!("Restalos {}",restalos(a,b));
    println!("Multiplicalos {}",multiplicalos(a,b));
    println!("Dividelos {}",dividelos(a,b));
    println!("Residuo {}",residual(a,b));
}

fn sumalos(a : i32, b :i32) -> i32{
    return a+b;
}

fn restalos(a : i32, b :i32) -> i32{
    return a-b;
}
fn multiplicalos(a : i32, b :i32) -> i32{
    return a*b;
}
fn dividelos(a : i32, b :i32) -> i32{
    let mut res=0;
    if (b>0){
        res=a/b;
    }
    return res;
}

fn residual (a : i32, b :i32) -> i32{
    return a%b;
}