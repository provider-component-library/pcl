package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I198Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		
        try {
            Thread.sleep(38);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b4Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b8Provider.get(request);
		
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b10Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b16Provider.get(request);
		int p9Val = b17Provider.get(request);
		int p10Val = b18Provider.get(request);
		int p11Val = b20Provider.get(request);
		int p12Val = b21Provider.get(request);
		int p13Val = b23Provider.get(request);
		int p14Val = b26Provider.get(request);
		int p15Val = b27Provider.get(request);
		int p16Val = b33Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b40Provider.get(request);
		
        try {
            Thread.sleep(56);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = b43Provider.get(request);
		int p20Val = b45Provider.get(request);
		int p21Val = b47Provider.get(request);

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
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val;
    }
}
