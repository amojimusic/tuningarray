TuningArray {

	*edo {
		arg root = 50, edo = 12;
		var i = -1;
		^Array.fill(edo, {
			i = i + 1;
			root + ((12/edo) * i);
		}).midicps;



	}

}