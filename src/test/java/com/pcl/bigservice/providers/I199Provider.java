package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I199Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b50Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b14Provider.get(request);
		int p3Val = b15Provider.get(request);
		int p4Val = b16Provider.get(request);
		
        try {
            Thread.sleep(86);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p5Val = b20Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b23Provider.get(request);
		int p7Val = b24Provider.get(request);
		int p8Val = b27Provider.get(request);
		int p9Val = b32Provider.get(request);
		int p10Val = b33Provider.get(request);
		int p11Val = b35Provider.get(request);
		int p12Val = b37Provider.get(request);
		int p13Val = b38Provider.get(request);
		int p14Val = b39Provider.get(request);
		
        try {
            Thread.sleep(24);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p15Val = b50Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val;
    }
}
