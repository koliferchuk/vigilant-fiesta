package object fiesta {
	sealed trait Err
	
	type Res[T] = Either[Err, T]
}