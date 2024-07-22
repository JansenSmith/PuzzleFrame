CSG puzzle = new Cube(195,195,2.6).toCSG().toZMax()
CSG bottom = new Cube(210,210,1).toCSG().toZMin()
			.movez(-5)

CSG base = bottom.union(puzzle).hull().difference(puzzle)
			.toZMin()

return base
//return [puzzle, bottom]