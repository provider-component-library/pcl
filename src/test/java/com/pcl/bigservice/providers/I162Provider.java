package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I162Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b5Provider.get(request);
		
        try {
            Thread.sleep(87);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b6Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b15Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b26Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b36Provider.get(request);
		int p14Val = b43Provider.get(request);
		int p15Val = b50Provider.get(request);
		int p16Val = i168Provider.get(request);
		int p17Val = i170Provider.get(request);
		int p18Val = i171Provider.get(request);
		
        try {
            Thread.sleep(72);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(49);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = i175Provider.get(request);
		int p20Val = i183Provider.get(request);
		int p21Val = i187Provider.get(request);
		int p22Val = i188Provider.get(request);
		int p23Val = i189Provider.get(request);
		int p24Val = i191Provider.get(request);
		int p25Val = i193Provider.get(request);
		int p26Val = i194Provider.get(request);
		int p27Val = i198Provider.get(request);

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
				p27Val;
    }
}
