package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I158Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p1Val = b1Provider.get(request);
		int p2Val = b7Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b24Provider.get(request);
		
        try {
            Thread.sleep(37);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b26Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b32Provider.get(request);
		int p11Val = b33Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b41Provider.get(request);
		int p15Val = b42Provider.get(request);
		int p16Val = b47Provider.get(request);
		int p17Val = i163Provider.get(request);
		int p18Val = i167Provider.get(request);
		int p19Val = i175Provider.get(request);
		int p20Val = i179Provider.get(request);
		int p21Val = i181Provider.get(request);
		int p22Val = i183Provider.get(request);
		int p23Val = i186Provider.get(request);
		int p24Val = i187Provider.get(request);
		int p25Val = i188Provider.get(request);
		int p26Val = i189Provider.get(request);
		
        try {
            Thread.sleep(44);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p27Val = i194Provider.get(request);
		int p28Val = i195Provider.get(request);
		int p29Val = i198Provider.get(request);
		int p30Val = i199Provider.get(request);
		int p31Val = i200Provider.get(request);

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
