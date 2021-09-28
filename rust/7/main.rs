fn main() {
    let _a=15;
    let _b=5;
    let add = |a: i32, b: i32| -> i32 { a + b };
    let substrac = |a: i32, b: i32| -> i32 { a - b };
    let multiply = |a: i32, b: i32| -> i32 { a * b };
    let divide = |a: i32, b: i32| -> i32 { a / b };
    
    println!("add: {}", add(_a, _b));
    println!("substrac: {}", substrac(_a, _b));
    println!("multiply: {}", multiply(_a, _b));
    println!("divide: {}", divide(_a, _b));
}

