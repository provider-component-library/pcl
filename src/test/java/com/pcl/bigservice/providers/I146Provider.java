package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I146Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p1Val = b3Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b7Provider.get(request);
		
        try {
            Thread.sleep(43);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b8Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b25Provider.get(request);
		int p9Val = b27Provider.get(request);
		int p10Val = b30Provider.get(request);
		int p11Val = b32Provider.get(request);
		int p12Val = b35Provider.get(request);
		
        try {
            Thread.sleep(72);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p13Val = b36Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b41Provider.get(request);
		int p16Val = b42Provider.get(request);
		int p17Val = b43Provider.get(request);
		int p18Val = b44Provider.get(request);
		int p19Val = b45Provider.get(request);
		int p20Val = b49Provider.get(request);
		int p21Val = b50Provider.get(request);
		int p22Val = i149Provider.get(request);
		int p23Val = i150Provider.get(request);
		int p24Val = i157Provider.get(request);
		int p25Val = i168Provider.get(request);
		int p26Val = i170Provider.get(request);
		int p27Val = i171Provider.get(request);
		int p28Val = i172Provider.get(request);
		int p29Val = i176Provider.get(request);
		int p30Val = i179Provider.get(request);
		int p31Val = i180Provider.get(request);
		int p32Val = i185Provider.get(request);
		int p33Val = i188Provider.get(request);
		int p34Val = i190Provider.get(request);
		int p35Val = i193Provider.get(request);
		int p36Val = i194Provider.get(request);
		int p37Val = i195Provider.get(request);
		int p38Val = i198Provider.get(request);

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
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val;
    }
}
