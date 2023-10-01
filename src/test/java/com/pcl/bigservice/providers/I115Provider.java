package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I115Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b14Provider.get(request);
		
        try {
            Thread.sleep(83);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b16Provider.get(request);
		int p7Val = b19Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b24Provider.get(request);
		int p11Val = b25Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b39Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b43Provider.get(request);
		int p18Val = b44Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b47Provider.get(request);
		int p21Val = b48Provider.get(request);
		int p22Val = i120Provider.get(request);
		int p23Val = i123Provider.get(request);
		int p24Val = i125Provider.get(request);
		int p25Val = i133Provider.get(request);
		int p26Val = i136Provider.get(request);
		int p27Val = i139Provider.get(request);
		int p28Val = i143Provider.get(request);
		int p29Val = i145Provider.get(request);
		int p30Val = i146Provider.get(request);
		int p31Val = i150Provider.get(request);
		int p32Val = i155Provider.get(request);
		int p33Val = i160Provider.get(request);
		int p34Val = i162Provider.get(request);
		int p35Val = i167Provider.get(request);
		int p36Val = i168Provider.get(request);
		int p37Val = i172Provider.get(request);
		int p38Val = i174Provider.get(request);
		
        try {
            Thread.sleep(82);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p39Val = i176Provider.get(request);
		int p40Val = i182Provider.get(request);
		int p41Val = i183Provider.get(request);
		int p42Val = i185Provider.get(request);
		int p43Val = i186Provider.get(request);
		int p44Val = i187Provider.get(request);
		int p45Val = i188Provider.get(request);
		int p46Val = i192Provider.get(request);
		int p47Val = i193Provider.get(request);
		int p48Val = i194Provider.get(request);
		int p49Val = i196Provider.get(request);

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
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val;
    }
}
