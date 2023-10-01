package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I155Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
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
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		
        try {
            Thread.sleep(84);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b9Provider.get(request);
		int p7Val = b10Provider.get(request);
		int p8Val = b11Provider.get(request);
		
        try {
            Thread.sleep(21);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b12Provider.get(request);
		int p10Val = b14Provider.get(request);
		int p11Val = b16Provider.get(request);
		int p12Val = b17Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p13Val = b24Provider.get(request);
		int p14Val = b25Provider.get(request);
		int p15Val = b26Provider.get(request);
		int p16Val = b29Provider.get(request);
		int p17Val = b32Provider.get(request);
		int p18Val = b33Provider.get(request);
		int p19Val = b35Provider.get(request);
		int p20Val = b36Provider.get(request);
		int p21Val = b38Provider.get(request);
		int p22Val = b41Provider.get(request);
		int p23Val = b46Provider.get(request);
		int p24Val = b49Provider.get(request);
		int p25Val = i157Provider.get(request);
		int p26Val = i159Provider.get(request);
		int p27Val = i160Provider.get(request);
		int p28Val = i169Provider.get(request);
		int p29Val = i170Provider.get(request);
		int p30Val = i173Provider.get(request);
		int p31Val = i177Provider.get(request);
		int p32Val = i179Provider.get(request);
		int p33Val = i182Provider.get(request);
		int p34Val = i183Provider.get(request);
		int p35Val = i185Provider.get(request);
		int p36Val = i190Provider.get(request);
		int p37Val = i193Provider.get(request);
		int p38Val = i196Provider.get(request);
		int p39Val = i200Provider.get(request);

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
				p38Val +
				p39Val;
    }
}
