CSG puzzle = new Cube(200,200,2.5).toCSG().toZMax()
CSG bottom = new Cube(210,210,1).toCSG().toZMin()
			.movez(-5)

CSG base = bottom.union(puzzle).hull().difference(puzzle)
			.toZMin()

return base
//return [puzzle, bottom]