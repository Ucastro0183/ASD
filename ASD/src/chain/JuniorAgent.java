package chain;

public class JuniorAgent extends AbstractAgent {


	@Override
	public boolean canHandleRequest(Request req) {
		return (req.getRequstType() == RequestType.JUNIOR);
	}

	@Override
	public String toString() {

		return "Junior Agent";
	}

}
