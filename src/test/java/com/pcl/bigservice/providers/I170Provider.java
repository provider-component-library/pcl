package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I170Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b12Provider.get(request);
		int p8Val = b14Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b35Provider.get(request);
		int p13Val = b36Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b39Provider.get(request);
		int p17Val = b41Provider.get(request);
		int p18Val = b42Provider.get(request);
		int p19Val = b44Provider.get(request);
		
        try {
            Thread.sleep(87);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(37);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p20Val = b47Provider.get(request);
		int p21Val = b48Provider.get(request);
		int p22Val = i173Provider.get(request);
		int p23Val = i174Provider.get(request);
		int p24Val = i176Provider.get(request);
		
        try {
            Thread.sleep(76);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i185Provider.get(request);
		int p26Val = i188Provider.get(request);
		int p27Val = i190Provider.get(request);
		int p28Val = i191Provider.get(request);
		int p29Val = i197Provider.get(request);
		int p30Val = i199Provider.get(request);

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
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val;
    }
}
