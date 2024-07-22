CSG puzzle = new Cube(200,200,2.5).toCSG()
CSG bottom = new Cube(210,210,1).toCSG()
			.movez(-5)

CSG base = bottom.union(puzzle).hull().difference(puzzle)

return base
//return [puzzle, bottom]