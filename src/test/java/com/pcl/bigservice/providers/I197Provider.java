package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I197Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b4Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b21Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b24Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b32Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b33Provider.get(request);
		
        try {
            Thread.sleep(69);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p15Val = b37Provider.get(request);
		int p16Val = b38Provider.get(request);
		int p17Val = b41Provider.get(request);
		int p18Val = b42Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = i198Provider.get(request);

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
