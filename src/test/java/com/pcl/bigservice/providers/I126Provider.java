package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I126Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b10Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b32Provider.get(request);
		int p10Val = b33Provider.get(request);
		int p11Val = b34Provider.get(request);
		int p12Val = b35Provider.get(request);
		int p13Val = b37Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b41Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b47Provider.get(request);
		
        try {
            Thread.sleep(83);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b50Provider.get(request);
		int p18Val = i127Provider.get(request);
		int p19Val = i128Provider.get(request);
		int p20Val = i132Provider.get(request);
		int p21Val = i140Provider.get(request);
		int p22Val = i141Provider.get(request);
		int p23Val = i146Provider.get(request);
		int p24Val = i148Provider.get(request);
		int p25Val = i150Provider.get(request);
		int p26Val = i151Provider.get(request);
		int p27Val = i152Provider.get(request);
		int p28Val = i158Provider.get(request);
		int p29Val = i160Provider.get(request);
		int p30Val = i161Provider.get(request);
		int p31Val = i162Provider.get(request);
		int p32Val = i165Provider.get(request);
		int p33Val = i166Provider.get(request);
		
        try {
            Thread.sleep(39);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p34Val = i167Provider.get(request);
		int p35Val = i171Provider.get(request);
		int p36Val = i172Provider.get(request);
		int p37Val = i174Provider.get(request);
		int p38Val = i175Provider.get(request);
		int p39Val = i176Provider.get(request);
		int p40Val = i178Provider.get(request);
		int p41Val = i184Provider.get(request);
		int p42Val = i185Provider.get(request);
		int p43Val = i187Provider.get(request);
		int p44Val = i189Provider.get(request);
		int p45Val = i191Provider.get(request);
		int p46Val = i192Provider.get(request);
		int p47Val = i193Provider.get(request);
		int p48Val = i196Provider.get(request);
		int p49Val = i197Provider.get(request);

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
