package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I171Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b3Provider.get(request);
		
        try {
            Thread.sleep(54);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b4Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b7Provider.get(request);
		int p6Val = b8Provider.get(request);
		int p7Val = b9Provider.get(request);
		int p8Val = b13Provider.get(request);
		int p9Val = b14Provider.get(request);
		int p10Val = b15Provider.get(request);
		
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p11Val = b23Provider.get(request);
		int p12Val = b27Provider.get(request);
		int p13Val = b28Provider.get(request);
		int p14Val = b31Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p15Val = b32Provider.get(request);
		int p16Val = b33Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b45Provider.get(request);
		int p19Val = b50Provider.get(request);
		int p20Val = i173Provider.get(request);
		int p21Val = i174Provider.get(request);
		int p22Val = i180Provider.get(request);
		int p23Val = i182Provider.get(request);
		int p24Val = i185Provider.get(request);
		int p25Val = i186Provider.get(request);
		int p26Val = i187Provider.get(request);
		int p27Val = i188Provider.get(request);
		int p28Val = i189Provider.get(request);
		int p29Val = i192Provider.get(request);
		int p30Val = i194Provider.get(request);
		int p31Val = i198Provider.get(request);

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
				p30Val +
				p31Val;
    }
}
